// Copyright (c) Meta Platforms, Inc. and affiliates.
// All rights reserved.
//
// This source code is licensed under the terms described in the LICENSE file in
// the root directory of this source tree.

package com.llama.llamastack.errors

class LlamaStackClientInvalidDataException(message: String? = null, cause: Throwable? = null) :
    LlamaStackClientException(message, cause)
