package github.xcodebn.intellijiconscompose.ide.notification

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Closehover: ImageVector
    get() {
        if (_Closehover != null) return _Closehover!!

        _Closehover = ImageVector.Builder(
            name = "Closehover",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 5f)
                lineTo(12f, 5f)
                lineTo(12f, 7f)
                lineTo(7f, 7f)
                lineTo(7f, 12f)
                lineTo(5f, 12f)
                lineTo(5f, 7f)
                lineTo(-0f, 7f)
                lineTo(-0f, 5f)
                lineTo(5f, 5f)
                lineTo(5f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 5f)
                close()
            }
        }.build()

        return _Closehover!!
    }

private var _Closehover: ImageVector? = null

