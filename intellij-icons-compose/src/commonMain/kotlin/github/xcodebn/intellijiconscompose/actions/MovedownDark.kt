package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MovedownDark: ImageVector
    get() {
        if (_MovedownDark != null) return _MovedownDark!!

        _MovedownDark = ImageVector.Builder(
            name = "MovedownDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 5f)
                lineTo(14f, 11f)
                lineTo(2f, 11f)
                close()
            }
        }.build()

        return _MovedownDark!!
    }

private var _MovedownDark: ImageVector? = null

