// Task 6.4.1

import io.kotest.core.config.AbstractProjectConfig

@Suppress("unused")
object KotestProjectConfig : AbstractProjectConfig() {
    override val globalAssertSoftly = true
}
