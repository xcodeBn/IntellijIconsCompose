package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SeparatorhDark: ImageVector
    get() {
        if (_SeparatorhDark != null) return _SeparatorhDark!!

        _SeparatorhDark = ImageVector.Builder(
            name = "SeparatorhDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {

        }.build()

        return _SeparatorhDark!!
    }

private var _SeparatorhDark: ImageVector? = null

