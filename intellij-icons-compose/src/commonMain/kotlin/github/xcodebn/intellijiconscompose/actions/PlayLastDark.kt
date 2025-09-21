package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlayLastDark: ImageVector
    get() {
        if (_PlayLastDark != null) return _PlayLastDark!!

        _PlayLastDark = ImageVector.Builder(
            name = "PlayLastDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 4f)
                lineTo(6f, 8f)
                lineTo(2f, 12f)
                lineTo(4f, 13f)
                lineTo(9f, 8f)
                lineTo(4f, 3f)
                lineTo(2f, 4f)
                close()
                moveTo(10f, 3f)
                lineTo(12f, 3f)
                lineTo(12f, 13f)
                lineTo(10f, 13f)
                lineTo(10f, 3f)
                close()
            }
        }.build()

        return _PlayLastDark!!
    }

private var _PlayLastDark: ImageVector? = null

