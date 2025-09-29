// Task 13.3

import io.kotest.core.config.AbstractProjectConfig

@Suppress("unused")
object KotestProjectConfig : AbstractProjectConfig() {
    override val globalAssertSoftly = true
}
