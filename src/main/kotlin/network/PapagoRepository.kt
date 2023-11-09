package network

import model.PapagoTranslateRes
import retrofit2.Response
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface PapagoRepository {

    @POST("v1/papago/n2mt")
    suspend fun translate(
        @Header("Content-Type") contentType: String = "application/x-www-form-urlencoded",
        @Header("X-Naver-Client-Id") clientId: String = "LrYrznT1XpnHnvKHhxLR",
        @Header("X-Naver-Client-Secret") clientSecret: String = "mfNmQ0G7Cn",
        @Query("source") sourceLang: String,
        @Query("target") targetLand: String,
        @Query("text") text: String
    ): Response<PapagoTranslateRes>
}