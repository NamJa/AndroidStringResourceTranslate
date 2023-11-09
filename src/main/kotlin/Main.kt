import data.SrcStringData
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*
import model.PapagoTranslateRes
import network.PapagoApiRepositoryImpl
import network.PapagoResult

fun main() = runBlocking<Unit> {
    val papagoRepo = PapagoApiRepositoryImpl()


    val strList = SrcStringData.srcString.split("\n")
    val strMutableMap: MutableMap<String, Pair<String, String>> = mutableMapOf()

    strList.forEach {
        if(!it.contains("<!--") && it.isNotEmpty()) {
            val strData =
                it.replace("<string name=\"", "")
                    .replace("</string>", "")
                    .replace("\">", "+++")
                    .split("+++")
            strMutableMap[strData[0]] = Pair(strData[1], "")
        } else if(it.contains("<!--")) {
            strMutableMap[it] = Pair(it, "")
        }
    }

    /** 데이터 수신 & FLOW EMIT */
    val flowData: Flow<Pair<String, PapagoResult<PapagoTranslateRes>>> = flow {
        strMutableMap.filter { !it.key.contains("<!--") }.forEach { (key, value) ->
            val sss = CoroutineScope(Dispatchers.IO).async {
                papagoRepo.translate("ko", "en", value.first)
            }
            val res = sss.await()
            emit(Pair(key, res))
        }
    }

    /** Flow collect */
    flowData.collect {
        when(it.second) {
            is PapagoResult.Success -> {
                val data = (it.second as PapagoResult.Success<PapagoTranslateRes>).data
                strMutableMap.put(it.first, Pair(strMutableMap[it.first]?.first ?: "", data.message.result.translatedText))
            }

            is PapagoResult.Error -> {
                val data = (it.second as PapagoResult.Error<PapagoTranslateRes>)
                println(data.message)
            }

            is PapagoResult.Loading -> {
                println("Loading")
            }
        }
    }

    /** 출력 */
    strMutableMap.forEach { (t, u) ->
        if(t.contains("<!--"))
            println("\n\t$t")
        else
            println("\t<string name=\"$t\">${u.second}</string>")
    }
}

/**
 * Client ID: LrYrznT1XpnHnvKHhxLR
 * Client Secret: mfNmQ0G7Cn
 * */