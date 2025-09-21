package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tree: ImageVector
    get() {
        if (_Tree != null) return _Tree!!

        _Tree = ImageVector.Builder(
            name = "Tree",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 1f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                verticalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(3f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(14f)
                horizontalLineTo(13f)
                verticalLineTo(10f)
                horizontalLineTo(10f)
                lineTo(9f, 9f)
                horizontalLineTo(6f)
                verticalLineTo(10f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(3f)
                horizontalLineTo(10f)
                lineTo(9f, 2f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                verticalLineTo(4f)
                horizontalLineTo(3f)
                verticalLineTo(1f)
                close()
            }
        }.build()

        return _Tree!!
    }

private var _Tree: ImageVector? = null

