package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Dropdown: ImageVector
    get() {
        if (_Dropdown != null) return _Dropdown!!

        _Dropdown = ImageVector.Builder(
            name = "Dropdown",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF333333)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13f, 13f)
                lineTo(16f, 16f)
                lineTo(10f, 16f)
                close()
            }
        }.build()

        return _Dropdown!!
    }

private var _Dropdown: ImageVector? = null

