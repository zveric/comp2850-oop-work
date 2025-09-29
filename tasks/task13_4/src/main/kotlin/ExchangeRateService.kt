// Task 13.4

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.net.URI

const val SERVICE_URL = "https://open.er-api.com/v6/latest/GBP"

class ExchangeRateService {
    private val url = URI.create(SERVICE_URL).toURL()
    private val mapper = jacksonObjectMapper()
    private val rates = mutableMapOf<String, Double>()

    init { updateRates() }

    fun updateRates() {
        val json = mapper.readTree(url)
        for (rate in json.path("rates").fields()) {
            rates[rate.key] = rate.value.asDouble()
        }
    }

    fun rateFor(currency: String): Double = rates.getOrElse(currency) {
        throw IllegalArgumentException("Unsupported currency: $currency")
    }
}
