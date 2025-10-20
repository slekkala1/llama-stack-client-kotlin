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

internal class QueryConditionTest {

    @Test
    fun create() {
        val queryCondition =
            QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()

        assertThat(queryCondition.key()).isEqualTo("key")
        assertThat(queryCondition.op()).isEqualTo(QueryCondition.Op.EQ)
        assertThat(queryCondition.value()).isEqualTo(QueryCondition.Value.ofBoolean(true))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val queryCondition =
            QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()

        val roundtrippedQueryCondition =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(queryCondition),
                jacksonTypeRef<QueryCondition>(),
            )

        assertThat(roundtrippedQueryCondition).isEqualTo(queryCondition)
    }
}
