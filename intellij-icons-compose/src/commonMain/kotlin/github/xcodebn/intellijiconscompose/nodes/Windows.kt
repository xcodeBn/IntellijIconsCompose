package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Windows: ImageVector
    get() {
        if (_Windows != null) return _Windows!!

        _Windows = ImageVector.Builder(
            name = "Windows",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0EAAE5)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 4f)
                lineTo(13f, 3f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(4f)
                close()
                moveTo(6f, 4f)
                lineTo(3f, 4f)
                verticalLineTo(7f)
                horizontalLineTo(6f)
                verticalLineTo(4f)
                close()
                moveTo(6f, 9f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                lineTo(6f, 12f)
                verticalLineTo(9f)
                close()
                moveTo(7f, 12f)
                lineTo(13f, 13f)
                verticalLineTo(9f)
                horizontalLineTo(7f)
                verticalLineTo(12f)
                close()
            }
        }.build()

        return _Windows!!
    }

private var _Windows: ImageVector? = null

