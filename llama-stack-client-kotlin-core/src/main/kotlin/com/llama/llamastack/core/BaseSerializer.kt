// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

package com.llama.llamastack.core

import com.fasterxml.jackson.databind.ser.std.StdSerializer
import kotlin.reflect.KClass

abstract class BaseSerializer<T : Any>(type: KClass<T>) : StdSerializer<T>(type.java)
