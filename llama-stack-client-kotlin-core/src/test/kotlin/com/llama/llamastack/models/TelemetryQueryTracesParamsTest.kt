// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

// File generated from our OpenAPI spec by Stainless.

package com.llama.llamastack.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TelemetryQueryTracesParamsTest {

    @Test
    fun create() {
        TelemetryQueryTracesParams.builder()
            .addAttributeFilter(
                QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
            )
            .limit(0L)
            .offset(0L)
            .addOrderBy("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            TelemetryQueryTracesParams.builder()
                .addAttributeFilter(
                    QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
                )
                .limit(0L)
                .offset(0L)
                .addOrderBy("string")
                .build()

        val body = params._body()

        assertThat(body.attributeFilters())
            .containsExactly(
                QueryCondition.builder().key("key").op(QueryCondition.Op.EQ).value(true).build()
            )
        assertThat(body.limit()).isEqualTo(0L)
        assertThat(body.offset()).isEqualTo(0L)
        assertThat(body.orderBy()).containsExactly("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TelemetryQueryTracesParams.builder().build()

        val body = params._body()
    }
}
