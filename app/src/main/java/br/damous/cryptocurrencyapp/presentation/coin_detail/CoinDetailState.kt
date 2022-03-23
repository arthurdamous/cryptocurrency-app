package br.damous.cryptocurrencyapp.presentation.coin_detail

import br.damous.cryptocurrencyapp.domain.model.Coin
import br.damous.cryptocurrencyapp.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
