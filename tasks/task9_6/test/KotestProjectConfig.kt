// Task 9.6

import io.kotest.core.config.AbstractProjectConfig

@Suppress("unused")
object KotestProjectConfig : AbstractProjectConfig() {
    override val globalAssertSoftly = true
}
