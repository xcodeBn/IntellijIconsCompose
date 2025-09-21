package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Ellipsis: ImageVector
    get() {
        if (_Ellipsis != null) return _Ellipsis!!

        _Ellipsis = ImageVector.Builder(
            name = "Ellipsis",
            defaultWidth = 9.0.dp,
            defaultHeight = 9.0.dp,
            viewportWidth = 9.0f,
            viewportHeight = 9.0f
        ).apply {

        }.build()

        return _Ellipsis!!
    }

private var _Ellipsis: ImageVector? = null

