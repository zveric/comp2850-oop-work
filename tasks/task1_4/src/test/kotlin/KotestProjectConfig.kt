// Task 1.4

import io.kotest.core.config.AbstractProjectConfig

@Suppress("unused")
object KotestProjectConfig : AbstractProjectConfig() {
    override val globalAssertSoftly = true
}
