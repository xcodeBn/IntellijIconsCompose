package github.xcodebn.intellijiconscompose.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Suggestedrefactoringbulbdisabled: ImageVector
    get() {
        if (_Suggestedrefactoringbulbdisabled != null) return _Suggestedrefactoringbulbdisabled!!

        _Suggestedrefactoringbulbdisabled = ImageVector.Builder(
            name = "Suggestedrefactoringbulbdisabled",
            defaultWidth = 13.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFC4C4C4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 0f)
                curveTo(3.73f, 0.00f, 4.37f, 0.29f, 4.79f, 0.77f)
                curveTo(5.13f, 1.19f, 5.33f, 1.76f, 5.33f, 2.43f)
                curveTo(5.33f, 3.72f, 4.69f, 4.48f, 3.78f, 4.79f)
                lineTo(5f, 6f)
                lineTo(4f, 7f)
                lineTo(3f, 5f)
                horizontalLineTo(1f)
                verticalLineTo(8f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                close()
                moveTo(1f, 4f)
                horizontalLineTo(3f)
                curveTo(3.47f, 3.82f, 3.92f, 3.31f, 3.92f, 2.53f)
                verticalLineTo(3f)
                curveTo(3.92f, 1.68f, 3.49f, 1.23f, 2.77f, 1.23f)
                horizontalLineTo(1f)
                verticalLineTo(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFC4C4C4)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 7f)
                lineTo(8f, 5f)
                lineTo(3f, 10f)
                verticalLineTo(12f)
                horizontalLineTo(5f)
                lineTo(10f, 7f)
                close()
                moveTo(12f, 5f)
                curveTo(12.07f, 5.02f, 12.07f, 4.42f, 11.84f, 4.20f)
                lineTo(11f, 3f)
                curveTo(10.59f, 2.94f, 9.99f, 2.94f, 9.77f, 3.17f)
                lineTo(9f, 4f)
                lineTo(11f, 6f)
                lineTo(12f, 5f)
                close()
            }
        }.build()

        return _Suggestedrefactoringbulbdisabled!!
    }

private var _Suggestedrefactoringbulbdisabled: ImageVector? = null

