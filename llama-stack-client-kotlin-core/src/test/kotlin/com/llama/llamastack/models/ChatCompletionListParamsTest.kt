// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ChatCompletionListParamsTest {

    @Test
    fun create() {
        ChatCompletionListParams.builder()
            .after("after")
            .limit(0L)
            .model("model")
            .order(ChatCompletionListParams.Order.ASC)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            ChatCompletionListParams.builder()
                .after("after")
                .limit(0L)
                .model("model")
                .order(ChatCompletionListParams.Order.ASC)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("after", "after")
                    .put("limit", "0")
                    .put("model", "model")
                    .put("order", "asc")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = ChatCompletionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
