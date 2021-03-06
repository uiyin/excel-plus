/**
 *  Copyright (c) 2018, biezhi (biezhi.me@gmail.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package io.github.biezhi.excel.plus.conveter;

import io.github.biezhi.excel.plus.exception.ConverterException;
import io.github.biezhi.excel.plus.util.StringUtil;

/**
 * Float to string converter
 *
 * @author biezhi
 * @date 2018-12-12
 */
public class FloatConverter extends NumberConverter implements Converter<String, Float> {

    @Override
    public Float stringToR(String value) throws ConverterException {
        try {
            value = super.replaceComma(value);
            if (StringUtil.isEmpty(value)) {
                return null;
            }
            return Float.parseFloat(value);
        } catch (Exception e){
            throw new ConverterException("convert [" + value + "] to Float error", e);
        }
    }

}
