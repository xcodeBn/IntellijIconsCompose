package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotEqual: ImageVector
    get() {
        if (_NotEqual != null) return _NotEqual!!

        _NotEqual = ImageVector.Builder(
            name = "NotEqual",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDB5860)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(9f, 5f)
                lineTo(11f, 2f)
                lineTo(12f, 2f)
                lineTo(10f, 5f)
                lineTo(14f, 5f)
                lineTo(14f, 7f)
                lineTo(9f, 7f)
                lineTo(8f, 9f)
                lineTo(14f, 9f)
                lineTo(14f, 11f)
                lineTo(7f, 11f)
                lineTo(5f, 14f)
                lineTo(4f, 14f)
                lineTo(5f, 11f)
                lineTo(2f, 11f)
                lineTo(2f, 9f)
                lineTo(6f, 9f)
                lineTo(8f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 5f)
                lineTo(9f, 5f)
                close()
            }
        }.build()

        return _NotEqual!!
    }

private var _NotEqual: ImageVector? = null

