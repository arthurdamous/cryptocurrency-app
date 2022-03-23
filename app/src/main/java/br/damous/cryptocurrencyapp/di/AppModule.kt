package br.damous.cryptocurrencyapp.di

import br.damous.cryptocurrencyapp.common.Constants
import br.damous.cryptocurrencyapp.data.remote.CoinPapricaApi
import br.damous.cryptocurrencyapp.data.repository.CoinRepositoryImpl
import br.damous.cryptocurrencyapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePaprikaApi(): CoinPapricaApi {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CoinPapricaApi::class.java)
    }

    @Provides
    @Singleton
    fun provideCoinRepository(api: CoinPapricaApi): CoinRepository {
        return CoinRepositoryImpl(api)
    }
}