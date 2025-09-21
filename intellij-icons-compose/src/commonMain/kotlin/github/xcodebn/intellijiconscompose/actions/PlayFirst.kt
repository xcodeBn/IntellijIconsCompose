package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlayFirst: ImageVector
    get() {
        if (_PlayFirst != null) return _PlayFirst!!

        _PlayFirst = ImageVector.Builder(
            name = "PlayFirst",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
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

        return _PlayFirst!!
    }

private var _PlayFirst: ImageVector? = null

