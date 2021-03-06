/**
 * Copyright (C) 2015 Cesar Valiente (cesar.valiente@gmail.com)
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
package com.cesarvaliente.permissionssample.action.utils;

import android.os.Build;

/**
 * Created by Cesar on 24/09/15.
 */
public class CommonUtils {

    public static boolean isMarshmallowOrHigher() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO
                && Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return false;
        } else {
            return true;
        }
    }
}
