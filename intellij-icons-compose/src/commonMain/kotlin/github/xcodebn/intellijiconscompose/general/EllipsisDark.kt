package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EllipsisDark: ImageVector
    get() {
        if (_EllipsisDark != null) return _EllipsisDark!!

        _EllipsisDark = ImageVector.Builder(
            name = "EllipsisDark",
            defaultWidth = 9.0.dp,
            defaultHeight = 9.0.dp,
            viewportWidth = 9.0f,
            viewportHeight = 9.0f
        ).apply {

        }.build()

        return _EllipsisDark!!
    }

private var _EllipsisDark: ImageVector? = null

