// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.llama.llamastack.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolParamDefinitionTest {

    @Test
    fun create() {
        val toolParamDefinition =
            ToolParamDefinition.builder()
                .paramType("param_type")
                .default(true)
                .description("description")
                .required(true)
                .build()

        assertThat(toolParamDefinition.paramType()).isEqualTo("param_type")
        assertThat(toolParamDefinition.default())
            .isEqualTo(ToolParamDefinition.Default.ofBoolean(true))
        assertThat(toolParamDefinition.description()).isEqualTo("description")
        assertThat(toolParamDefinition.required()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolParamDefinition =
            ToolParamDefinition.builder()
                .paramType("param_type")
                .default(true)
                .description("description")
                .required(true)
                .build()

        val roundtrippedToolParamDefinition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolParamDefinition),
                jacksonTypeRef<ToolParamDefinition>(),
            )

        assertThat(roundtrippedToolParamDefinition).isEqualTo(toolParamDefinition)
    }
}
