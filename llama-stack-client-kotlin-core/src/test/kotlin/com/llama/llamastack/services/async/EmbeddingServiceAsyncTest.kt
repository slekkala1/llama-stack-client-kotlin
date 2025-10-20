// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.async

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClientAsync
import com.llama.llamastack.models.EmbeddingCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class EmbeddingServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            LlamaStackClientOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .build()
        val embeddingServiceAsync = client.embeddings()

        val createEmbeddingsResponse =
            embeddingServiceAsync.create(
                EmbeddingCreateParams.builder()
                    .input("string")
                    .model("model")
                    .dimensions(0L)
                    .encodingFormat("encoding_format")
                    .user("user")
                    .build()
            )

        createEmbeddingsResponse.validate()
    }
}
