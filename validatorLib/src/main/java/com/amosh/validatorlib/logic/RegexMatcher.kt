/*
 * Modifications Copyright (c) 2021 EmberMed POC
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */
package com.amosh.validatorlib.logic

import java.util.regex.Pattern

/**
 * The type Regex matcher.
 */
class RegexMatcher {
    /**
     * Validate string against a regex.
     *
     * @param dataStr the data str
     * @param regex   the regex
     * @return the boolean
     */
    fun validate(dataStr: String?, regex: String?): Boolean {
        return if (regex == null || regex == "") {
            throw IllegalArgumentException("regex field cannot is be null or empty!")
        } else {
            val p = Pattern.compile(regex)
            validate(dataStr, p)
        }
    }

    /**
     * Find in string against a regex.
     *
     * @param dataStr the data str
     * @param regex   the regex
     * @return the boolean
     */
    fun find(dataStr: String?, regex: String?): Boolean {
        return if (regex == null || regex == "") {
            throw IllegalArgumentException("regex field cannot is be null or empty!")
        } else {
            val p = Pattern.compile(regex)
            find(dataStr, p)
        }
    }

    /**
     * Validate string against a pattern.
     *
     * @param dataStr the data str
     * @param pattern the pattern
     * @return the boolean
     */
    fun validate(dataStr: String?, pattern: Pattern): Boolean {
        return !(dataStr == null || dataStr == "") && pattern.matcher(dataStr).matches()
    }

    /**
     * Find in string against a pattern.
     *
     * @param dataStr the data str
     * @param pattern the pattern
     * @return the boolean
     */
    fun find(dataStr: String?, pattern: Pattern): Boolean {
        return !(dataStr == null || dataStr == "") && pattern.matcher(dataStr).find()
    }
}