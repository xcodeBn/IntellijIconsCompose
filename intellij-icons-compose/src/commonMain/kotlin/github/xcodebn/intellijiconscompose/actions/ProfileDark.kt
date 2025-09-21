package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProfileDark: ImageVector
    get() {
        if (_ProfileDark != null) return _ProfileDark!!

        _ProfileDark = ImageVector.Builder(
            name = "ProfileDark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6f)
                lineTo(11f, 6f)
                curveTo(10.31f, 3.20f, 8.36f, 1.41f, 6.00f, 1.41f)
                curveTo(3.47f, 1.41f, 1.41f, 3.47f, 1.41f, 6.00f)
                curveTo(1.41f, 8.53f, 3.47f, 10.58f, 6.00f, 10.58f)
                curveTo(6.34f, 10.58f, 6.68f, 10.55f, 7.00f, 10.47f)
                lineTo(7f, 12f)
                curveTo(6.67f, 11.97f, 6.34f, 12.00f, 6.00f, 12.00f)
                curveTo(2.69f, 12.00f, 0.00f, 9.31f, 0.00f, 6.00f)
                curveTo(0.00f, 2.69f, 2.69f, 0.00f, 6.00f, 0.00f)
                curveTo(9.15f, 0.00f, 11.73f, 2.42f, 11.98f, 5.50f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3f)
                lineTo(3f, 4f)
                lineTo(1f, 6f)
                lineTo(0f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF499C54))
            ) {
                moveTo(8f, 6f)
                lineTo(15f, 10f)
                lineTo(8f, 15f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 6f)
                    lineTo(11f, 6f)
                    curveTo(10.31f, 3.20f, 8.36f, 1.41f, 6.00f, 1.41f)
                    curveTo(3.47f, 1.41f, 1.41f, 3.47f, 1.41f, 6.00f)
                    curveTo(1.41f, 8.53f, 3.47f, 10.58f, 6.00f, 10.58f)
                    curveTo(6.34f, 10.58f, 6.68f, 10.55f, 7.00f, 10.47f)
                    lineTo(7f, 12f)
                    curveTo(6.67f, 11.97f, 6.34f, 12.00f, 6.00f, 12.00f)
                    curveTo(2.69f, 12.00f, 0.00f, 9.31f, 0.00f, 6.00f)
                    curveTo(0.00f, 2.69f, 2.69f, 0.00f, 6.00f, 0.00f)
                    curveTo(9.15f, 0.00f, 11.73f, 2.42f, 11.98f, 5.50f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 6f)
                    lineTo(11f, 6f)
                    curveTo(10.31f, 3.20f, 8.36f, 1.41f, 6.00f, 1.41f)
                    curveTo(3.47f, 1.41f, 1.41f, 3.47f, 1.41f, 6.00f)
                    curveTo(1.41f, 8.53f, 3.47f, 10.58f, 6.00f, 10.58f)
                    curveTo(6.34f, 10.58f, 6.68f, 10.55f, 7.00f, 10.47f)
                    lineTo(7f, 12f)
                    curveTo(6.67f, 11.97f, 6.34f, 12.00f, 6.00f, 12.00f)
                    curveTo(2.69f, 12.00f, 0.00f, 9.31f, 0.00f, 6.00f)
                    curveTo(0.00f, 2.69f, 2.69f, 0.00f, 6.00f, 0.00f)
                    curveTo(9.15f, 0.00f, 11.73f, 2.42f, 11.98f, 5.50f)
                    close()
                }
            }
        }.build()

        return _ProfileDark!!
    }

private var _ProfileDark: ImageVector? = null

