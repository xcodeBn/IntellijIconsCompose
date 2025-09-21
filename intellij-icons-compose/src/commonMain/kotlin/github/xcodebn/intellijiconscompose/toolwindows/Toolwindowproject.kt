package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Toolwindowproject: ImageVector
    get() {
        if (_Toolwindowproject != null) return _Toolwindowproject!!

        _Toolwindowproject = ImageVector.Builder(
            name = "Toolwindowproject",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 4f)
                lineTo(12f, 4f)
                lineTo(12f, 11f)
                lineTo(1f, 11f)
                lineTo(1f, 4f)
                lineTo(1f, 2f)
                lineTo(6f, 2f)
                lineTo(7f, 4f)
                close()
            }
        }.build()

        return _Toolwindowproject!!
    }

private var _Toolwindowproject: ImageVector? = null

