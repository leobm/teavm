/*
 *  Copyright 2014 Alexey Andreev.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.teavm.classlib.impl.unicode;

/**
 *
 * @author Alexey Andreev
 */
public class CLDRDateFormats {
    private String shortFormat;
    private String mediumFormat;
    private String longFormat;
    private String fullFormat;

    CLDRDateFormats(String shortFormat, String mediumFormat, String longFormat, String fullFormat) {
        this.shortFormat = shortFormat;
        this.mediumFormat = mediumFormat;
        this.longFormat = longFormat;
        this.fullFormat = fullFormat;
    }

    public String getShortFormat() {
        return shortFormat;
    }

    public String getMediumFormat() {
        return mediumFormat;
    }

    public String getLongFormat() {
        return longFormat;
    }

    public String getFullFormat() {
        return fullFormat;
    }
}
