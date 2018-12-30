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
package io.zatarox.squiggle.query;

import io.zatarox.squiggle.Matchable;
import io.zatarox.squiggle.Output;
import io.zatarox.squiggle.Outputable;
import io.zatarox.squiggle.TableColumn;

public class Assignment implements Outputable {

    private final TableColumn column;
    private final Matchable value;

    Assignment(TableColumn column, Matchable value) {
        this.column = column;
        this.value = value;
    }

    @Override
    public void write(Output output) {
        output.write(column).write(" = ").write(value);
    }
}
