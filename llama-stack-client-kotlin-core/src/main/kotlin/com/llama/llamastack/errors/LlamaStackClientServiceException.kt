// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.errors

import com.llama.llamastack.core.JsonValue
import com.llama.llamastack.core.http.Headers

abstract class LlamaStackClientServiceException
protected constructor(message: String, cause: Throwable? = null) :
    LlamaStackClientException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
