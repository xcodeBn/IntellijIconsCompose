package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RefactoringbulbDark: ImageVector
    get() {
        if (_RefactoringbulbDark != null) return _RefactoringbulbDark!!

        _RefactoringbulbDark = ImageVector.Builder(
            name = "RefactoringbulbDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFAFB1B3))
            ) {
                moveTo(8f, 8f)
                lineTo(7f, 9f)
                curveTo(6.72f, 2.00f, 7.36f, 2.29f, 7.78f, 2.77f)
                lineTo(8f, 8f)
                close()
                moveTo(4f, 6f)
                lineTo(6f, 6f)
                curveTo(6.46f, 5.82f, 6.91f, 5.31f, 6.91f, 4.53f)
                lineTo(7f, 5f)
                curveTo(6.91f, 3.68f, 6.48f, 3.23f, 5.76f, 3.23f)
                lineTo(4f, 3f)
                close()
                moveTo(13f, 9f)
                lineTo(11f, 7f)
                close()
                moveTo(15f, 7f)
                curveTo(15.06f, 7.02f, 15.06f, 6.42f, 14.83f, 6.20f)
                lineTo(14f, 5f)
                curveTo(13.58f, 4.94f, 12.98f, 4.94f, 12.76f, 5.17f)
                lineTo(12f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFAFB1B3))
                ) {
                    moveTo(8f, 8f)
                    lineTo(7f, 9f)
                    curveTo(6.72f, 2.00f, 7.36f, 2.29f, 7.78f, 2.77f)
                    lineTo(8f, 8f)
                    close()
                    moveTo(4f, 6f)
                    lineTo(6f, 6f)
                    curveTo(6.46f, 5.82f, 6.91f, 5.31f, 6.91f, 4.53f)
                    lineTo(7f, 5f)
                    curveTo(6.91f, 3.68f, 6.48f, 3.23f, 5.76f, 3.23f)
                    lineTo(4f, 3f)
                    close()
                    moveTo(13f, 9f)
                    lineTo(11f, 7f)
                    close()
                    moveTo(15f, 7f)
                    curveTo(15.06f, 7.02f, 15.06f, 6.42f, 14.83f, 6.20f)
                    lineTo(14f, 5f)
                    curveTo(13.58f, 4.94f, 12.98f, 4.94f, 12.76f, 5.17f)
                    lineTo(12f, 6f)
                    close()
                }
            }
        }.build()

        return _RefactoringbulbDark!!
    }

private var _RefactoringbulbDark: ImageVector? = null

