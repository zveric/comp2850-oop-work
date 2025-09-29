// Task 1.5

import io.kotest.core.config.AbstractProjectConfig

@Suppress("unused")
object KotestProjectConfig : AbstractProjectConfig() {
    override val globalAssertSoftly = true
}
