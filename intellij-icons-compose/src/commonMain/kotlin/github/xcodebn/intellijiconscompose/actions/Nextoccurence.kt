package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Nextoccurence: ImageVector
    get() {
        if (_Nextoccurence != null) return _Nextoccurence!!

        _Nextoccurence = ImageVector.Builder(
            name = "Nextoccurence",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _Nextoccurence!!
    }

private var _Nextoccurence: ImageVector? = null

