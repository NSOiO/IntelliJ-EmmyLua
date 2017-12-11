/*
 * Copyright (c) 2017. tangzx(love.tangzx@qq.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tang.intellij.lua.stubs

import com.intellij.psi.stubs.StubElement
import com.tang.intellij.lua.psi.LuaIndexExpr
import com.tang.intellij.lua.psi.Visibility
import com.tang.intellij.lua.stubs.types.LuaIndexExprType
import com.tang.intellij.lua.ty.ITy

/**

 * Created by TangZX on 2017/4/12.
 */
interface LuaIndexExprStub : StubElement<LuaIndexExpr>, LuaClassMemberStub<LuaIndexExpr> {
    val className: String?
    val name: String?
    val valueType: ITy
    val brack: Boolean
}

class LuaIndexExprStubImpl(override val className: String?,
                           override val name: String?,
                           override val docTy: ITy?,
                           override val valueType: ITy,
                           override val brack: Boolean,
                           override val visibility: Visibility,
                           stubElement: StubElement<*>,
                           indexType: LuaIndexExprType)
    : LuaStubBase<LuaIndexExpr>(stubElement, indexType), LuaIndexExprStub