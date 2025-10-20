// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.services.blocking

import com.llama.llamastack.TestServerExtension
import com.llama.llamastack.client.okhttp.LlamaStackClientOkHttpClient
import com.llama.llamastack.models.SyntheticDataGenerationGenerateParams
import com.llama.llamastack.models.UserMessage
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SyntheticDataGenerationServiceTest {

    @Test
    fun generate() {
        val client =
            LlamaStackClientOkHttpClient.builder().baseUrl(TestServerExtension.BASE_URL).build()
        val syntheticDataGenerationService = client.syntheticDataGeneration()

        val syntheticDataGenerationResponse =
            syntheticDataGenerationService.generate(
                SyntheticDataGenerationGenerateParams.builder()
                    .addDialog(UserMessage.builder().content("string").context("string").build())
                    .filteringFunction(SyntheticDataGenerationGenerateParams.FilteringFunction.NONE)
                    .model("model")
                    .build()
            )

        syntheticDataGenerationResponse.validate()
    }
}
