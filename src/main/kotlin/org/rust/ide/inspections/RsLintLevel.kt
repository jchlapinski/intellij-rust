package org.rust.ide.inspections

/**
 * Rust lint warning levels.
 */
enum class RsLintLevel(
    val id: String
) {
    /**
     * Warnings are suppressed.
     */
    ALLOW("allow"),

    /**
     * Warnings.
     */
    WARN("warn"),

    /**
     * Compliler errors.
     */
    DENY("deny");

    companion object {
        fun valueForId(id: String) = RsLintLevel.values().filter { it.id == id }.firstOrNull()
    }
}
