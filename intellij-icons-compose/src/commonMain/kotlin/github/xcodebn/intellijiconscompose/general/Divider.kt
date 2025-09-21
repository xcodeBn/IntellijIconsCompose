package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Divider: ImageVector
    get() {
        if (_Divider != null) return _Divider!!

        _Divider = ImageVector.Builder(
            name = "Divider",
            defaultWidth = 2.0.dp,
            defaultHeight = 19.0.dp,
            viewportWidth = 2.0f,
            viewportHeight = 19.0f
        ).apply {

        }.build()

        return _Divider!!
    }

private var _Divider: ImageVector? = null

