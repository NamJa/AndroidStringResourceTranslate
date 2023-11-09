package network

import retrofit2.HttpException
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PapagoApiRepositoryImpl {
    private val papagoApi: PapagoRepository
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://openapi.naver.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        papagoApi = retrofit.create(PapagoRepository::class.java)
    }

    suspend fun translate(sourceLang: String, targetLang: String, text: String) = try {
        val response = papagoApi.translate(sourceLang = sourceLang, targetLand = targetLang, text = text)
        val body = response.body()
        if(response.isSuccessful && body != null)
            PapagoResult.Success(data = body)
        else {
            PapagoResult.Error(message = response.errorBody()?.string() ?: "")
        }
    } catch (e: HttpException) {
        PapagoResult.Error(code = e.code().toString(), message = e.message.toString())
    } catch (e: Exception) {
        PapagoResult.Error(message = e.message.toString())
    }
}