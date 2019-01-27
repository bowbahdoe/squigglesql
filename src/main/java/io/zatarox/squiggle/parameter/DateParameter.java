/*
 * Copyright 2019 Egor Nepomnyaschih.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.zatarox.squiggle.parameter;

import io.zatarox.squiggle.statement.Parametrized;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;

class DateParameter extends Parameter {

    private final Date value;
    private final Calendar calendar;

    DateParameter(Date value, Calendar calendar) {
        this.value = value;
        this.calendar = calendar;
    }

    @Override
    public void addValue(Parametrized builder) throws SQLException {
        builder.addDate(value, calendar);
    }
}
