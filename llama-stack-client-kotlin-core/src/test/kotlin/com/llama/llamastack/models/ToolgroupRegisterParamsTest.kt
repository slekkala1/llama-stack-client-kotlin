// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.llama.llamastack.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolgroupRegisterParamsTest {

    @Test
    fun create() {
        ToolgroupRegisterParams.builder()
            .providerId("provider_id")
            .toolgroupId("toolgroup_id")
            .args(
                ToolgroupRegisterParams.Args.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
            .mcpEndpoint(ToolgroupRegisterParams.McpEndpoint.builder().uri("uri").build())
            .build()
    }

    @Test
    fun body() {
        val params =
            ToolgroupRegisterParams.builder()
                .providerId("provider_id")
                .toolgroupId("toolgroup_id")
                .args(
                    ToolgroupRegisterParams.Args.builder()
                        .putAdditionalProperty("foo", JsonValue.from(true))
                        .build()
                )
                .mcpEndpoint(ToolgroupRegisterParams.McpEndpoint.builder().uri("uri").build())
                .build()

        val body = params._body()

        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.toolgroupId()).isEqualTo("toolgroup_id")
        assertThat(body.args())
            .isEqualTo(
                ToolgroupRegisterParams.Args.builder()
                    .putAdditionalProperty("foo", JsonValue.from(true))
                    .build()
            )
        assertThat(body.mcpEndpoint())
            .isEqualTo(ToolgroupRegisterParams.McpEndpoint.builder().uri("uri").build())
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            ToolgroupRegisterParams.builder()
                .providerId("provider_id")
                .toolgroupId("toolgroup_id")
                .build()

        val body = params._body()

        assertThat(body.providerId()).isEqualTo("provider_id")
        assertThat(body.toolgroupId()).isEqualTo("toolgroup_id")
    }
}
