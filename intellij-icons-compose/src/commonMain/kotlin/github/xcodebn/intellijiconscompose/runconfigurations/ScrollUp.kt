package github.xcodebn.intellijiconscompose.runconfigurations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ScrollUp: ImageVector
    get() {
        if (_ScrollUp != null) return _ScrollUp!!

        _ScrollUp = ImageVector.Builder(
            name = "ScrollUp",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 9f)
                horizontalLineTo(7f)
                lineTo(11f, 5f)
                lineTo(15f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _ScrollUp!!
    }

private var _ScrollUp: ImageVector? = null

