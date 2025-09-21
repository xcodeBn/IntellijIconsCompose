package github.xcodebn.intellijiconscompose.plugins

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Rating: ImageVector
    get() {
        if (_Rating != null) return _Rating!!

        _Rating = ImageVector.Builder(
            name = "Rating",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF737373)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 8f)
                lineTo(2f, 10f)
                lineTo(3f, 6f)
                lineTo(0f, 4f)
                lineTo(4f, 3f)
                lineTo(6f, 0f)
                lineTo(7f, 3f)
                lineTo(11f, 4f)
                lineTo(8f, 6f)
                lineTo(9f, 10f)
                lineTo(6f, 8f)
                close()
                moveTo(6f, 7f)
                lineTo(8f, 8f)
                lineTo(7f, 6f)
                lineTo(9f, 4f)
                lineTo(7f, 4f)
                lineTo(6f, 2f)
                lineTo(4f, 4f)
                lineTo(2f, 4f)
                lineTo(4f, 6f)
                lineTo(3f, 8f)
                lineTo(6f, 7f)
                close()
            }
        }.build()

        return _Rating!!
    }

private var _Rating: ImageVector? = null

