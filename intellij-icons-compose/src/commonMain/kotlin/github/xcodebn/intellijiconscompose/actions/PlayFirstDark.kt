package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlayFirstDark: ImageVector
    get() {
        if (_PlayFirstDark != null) return _PlayFirstDark!!

        _PlayFirstDark = ImageVector.Builder(
            name = "PlayFirstDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(4f, 4f)
                lineTo(8f, 8f)
                lineTo(4f, 12f)
                lineTo(5f, 13f)
                lineTo(10f, 8f)
                lineTo(5f, 3f)
                lineTo(4f, 4f)
                close()
                moveTo(12f, 3f)
                lineTo(14f, 3f)
                lineTo(14f, 13f)
                lineTo(12f, 13f)
                lineTo(12f, 3f)
                close()
            }
        }.build()

        return _PlayFirstDark!!
    }

private var _PlayFirstDark: ImageVector? = null

