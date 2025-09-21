package github.xcodebn.intellijiconscompose.plugins

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UpdatedDark: ImageVector
    get() {
        if (_UpdatedDark != null) return _UpdatedDark!!

        _UpdatedDark = ImageVector.Builder(
            name = "UpdatedDark",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF787878))
            ) {
                moveTo(9f, 4f)
                lineTo(8f, 4f)
                lineTo(8f, 4f)
                curveTo(7.36f, 2.90f, 6.48f, 2.50f, 5.50f, 2.50f)
                curveTo(3.57f, 2.50f, 2.00f, 4.07f, 2.00f, 6.00f)
                curveTo(2.00f, 7.93f, 3.57f, 9.50f, 5.50f, 9.50f)
                curveTo(7.26f, 9.50f, 8.72f, 8.20f, 8.96f, 6.50f)
                lineTo(10f, 6f)
                curveTo(9.72f, 8.75f, 7.82f, 10.50f, 5.50f, 10.50f)
                curveTo(3.01f, 10.50f, 1.00f, 8.49f, 1.00f, 6.00f)
                curveTo(1.00f, 3.51f, 3.01f, 1.50f, 5.50f, 1.50f)
                curveTo(7.06f, 1.50f, 8.43f, 2.29f, 9.24f, 3.50f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF787878))
            ) {
                moveTo(10f, 1f)
                lineTo(10f, 5f)
                lineTo(6f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF787878))
                ) {
                    moveTo(9f, 4f)
                    lineTo(8f, 4f)
                    lineTo(8f, 4f)
                    curveTo(7.36f, 2.90f, 6.48f, 2.50f, 5.50f, 2.50f)
                    curveTo(3.57f, 2.50f, 2.00f, 4.07f, 2.00f, 6.00f)
                    curveTo(2.00f, 7.93f, 3.57f, 9.50f, 5.50f, 9.50f)
                    curveTo(7.26f, 9.50f, 8.72f, 8.20f, 8.96f, 6.50f)
                    lineTo(10f, 6f)
                    curveTo(9.72f, 8.75f, 7.82f, 10.50f, 5.50f, 10.50f)
                    curveTo(3.01f, 10.50f, 1.00f, 8.49f, 1.00f, 6.00f)
                    curveTo(1.00f, 3.51f, 3.01f, 1.50f, 5.50f, 1.50f)
                    curveTo(7.06f, 1.50f, 8.43f, 2.29f, 9.24f, 3.50f)
                    close()
                }
            }
        }.build()

        return _UpdatedDark!!
    }

private var _UpdatedDark: ImageVector? = null

