package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Rating2: ImageVector
    get() {
        if (_Rating2 != null) return _Rating2!!

        _Rating2 = ImageVector.Builder(
            name = "Rating2",
            defaultWidth = 11.0.dp,
            defaultHeight = 11.0.dp,
            viewportWidth = 11.0f,
            viewportHeight = 11.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF389FD6)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 9f)
                lineTo(2f, 11f)
                lineTo(3f, 7f)
                lineTo(0f, 4f)
                lineTo(4f, 4f)
                lineTo(6f, 0f)
                lineTo(7f, 4f)
                lineTo(11f, 4f)
                lineTo(8f, 7f)
                lineTo(9f, 11f)
                lineTo(6f, 9f)
                close()
                moveTo(6f, 8f)
                lineTo(8f, 9f)
                lineTo(7f, 7f)
                lineTo(9f, 5f)
                lineTo(7f, 4f)
                lineTo(6f, 2f)
                lineTo(5f, 3f)
                lineTo(5f, 8f)
                lineTo(6f, 8f)
                close()
            }
        }.build()

        return _Rating2!!
    }

private var _Rating2: ImageVector? = null

