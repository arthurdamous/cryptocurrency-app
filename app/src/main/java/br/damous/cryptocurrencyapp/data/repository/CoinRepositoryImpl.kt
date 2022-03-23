package br.damous.cryptocurrencyapp.data.repository

import br.damous.cryptocurrencyapp.data.remote.CoinPapricaApi
import br.damous.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import br.damous.cryptocurrencyapp.data.remote.dto.CoinDto
import br.damous.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPapricaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}