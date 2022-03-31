package example.module

import mu.KotlinLogging

/**
 * Check Args of main function.
 */
class ArgsValidator(args: Array<String>) {
    private val logger = KotlinLogging.logger {}

    init {
        logger.info { println("called init code block of ${ArgsValidator::class.qualifiedName}") }

        logger.info { println("") }
    }

}