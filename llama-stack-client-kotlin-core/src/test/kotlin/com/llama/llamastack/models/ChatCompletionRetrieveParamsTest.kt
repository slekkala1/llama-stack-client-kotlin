// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionRetrieveParamsTest {

    @Test
    fun create() {
        ChatCompletionRetrieveParams.builder().completionId("completion_id").build()
    }

    @Test
    fun pathParams() {
        val params = ChatCompletionRetrieveParams.builder().completionId("completion_id").build()

        assertThat(params._pathParam(0)).isEqualTo("completion_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
