// ISSUE: KT-58665
// FULL_JDK

import java.util.*

fun use(x: String?) {
    Optional.of(<!ARGUMENT_TYPE_MISMATCH!>x<!>)
}